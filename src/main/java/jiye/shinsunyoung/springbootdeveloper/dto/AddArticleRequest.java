package jiye.shinsunyoung.springbootdeveloper.dto;      //dto 패키지를 컨트롤러에서 요청한 본문을 받을 객체


import jiye.shinsunyoung.springbootdeveloper.domain.Article;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor      //기본 생성자 추가
@AllArgsConstructor     //모든 필드 값을 파라미터로 받는 생성자 추가
@Getter
public class AddArticleRequest {

    private String title;
    private String content;

    public Article toEntity(){      //생성자를 이용해 객체 생성
        return Article.builder()
                .title(title)
                .content(content)
                .build();
    }
}
