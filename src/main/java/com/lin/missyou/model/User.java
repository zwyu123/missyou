package com.lin.missyou.model;

import com.lin.missyou.util.MapAndJson;
import lombok.*;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.util.Map;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Where(clause = "delete_time is null")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String openid;
    private String nickname;
    private String email;
    private String mobile;
    private String password;
    private Long unifyUid;

    @Convert(converter = MapAndJson.class)
    private Map<String, Object> wxProfile;
}
