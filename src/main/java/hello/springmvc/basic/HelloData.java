package hello.springmvc.basic;

import lombok.Data;

/*
 * lombok 의 @Data 는
 * @Getter, @Setter, @ToString, @EqualsAndHashCode, @RequiredArgsConstructor 를
 * 자동으로 적용해준다.
 */
@Data
public class HelloData {
    private String username;
    private int age;
}
