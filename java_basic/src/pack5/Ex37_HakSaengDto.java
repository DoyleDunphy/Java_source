package pack5;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//Lombok 을 사용해서 생성자 , getter , setter 만들기
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Ex37_HakSaengDto {
	private String name;
	private int kor,eng,mat;

}
