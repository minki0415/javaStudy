/** 
 * PROJECT  : 재능기부 프로젝트
 * NAME  :  EndView.java
 * DESC  : 재능 기부 정보 출력 클래스
 * 
 * @author  
 * @version 1.0
*/

package step02.probono.view;

import java.util.ArrayList;
import java.util.Optional;

import step02.probono.model.dto.TalentDonationProject;

public class EndView {
	
	//? Optional API로 변경
	//진행중인 특정 프로젝트 출력 
	public static void projectView(TalentDonationProject project) {
		
		/* if의 else 문장처럼 orElse() 호출
		 * 문제 발생
		 * 		객체 존재 여부 검증 타입 : TalentDonationProject
		 * 		orElse()의 parameter로 TalentDonationProject 타입이어야 함
		 * 
		 * 문제 해결
		 * 		문자열 출력을 위한 해결점 - 다형성
		 */
		
		Optional<Object> opt = Optional.ofNullable(project);
		System.out.println(opt.orElse("해당 프로젝트는 존재하지 않습니다."));
	}
	
//	public static void projectView(TalentDonationProject project){
//		if(project != null) {
//			System.out.println(project);		
//		}else {
//			System.out.println("해당 프로젝트는 존재하지 않습니다.");
//		}
//	}
	
	//진행중인 모든 프로젝트 출력
	public static void projectListView(ArrayList<TalentDonationProject> allProbonoProject){
			
		for(int index = 0; index < allProbonoProject.size(); index++){	//0~9까지의 기준으로 10번 반복시도	
			if(allProbonoProject.get(index) != null){
				System.out.println("[진행 중인 project : " + (index+1) + "] " + allProbonoProject.get(index));
			}
		}
		
	}
}
