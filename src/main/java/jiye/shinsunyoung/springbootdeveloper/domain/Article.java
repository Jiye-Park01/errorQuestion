package jiye.shinsunyoung.springbootdeveloper.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.web.ErrorResponse;

@Entity     //엔터티로 지정
@Getter        //롬복에 게터
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Article {

    @Id            //id 필드를 기본키로 지정
    @GeneratedValue(strategy =  GenerationType.IDENTITY)        //기본키를 자동으로 1씩 증가
    @Column(name="id", updatable = false)
    private Long id;

    @Column(name = "title", nullable = false)       //'title'이라는 not null 컬럼과 매칭
    private String title;

    @Column(name = "content", nullable = false)
    private String content;

    @Builder    //빌더 패턴으로 객체 생성
    public Article(String title, String content){
        this.title = title;
        this.content = content;
    }

}
