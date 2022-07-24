package com.httpServerTest.httpServer.config.auth;


import com.httpServerTest.httpServer.Entity.Member;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;

public class PrincipalDetails implements UserDetails {


    private Member member;

    public PrincipalDetails(Member member) {
        this.member = member;
    }


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        Collection<GrantedAuthority> collection = new ArrayList<>();
        collection.add(new GrantedAuthority() {
            @Override
            public String getAuthority() {  //user권한 return
                return member.getRole();
            }
        });
        return collection;
    }

    @Override
    public String getPassword() {
        return member.getPassword();
    }

    @Override
    public String getUsername() {
        return member.getUsername();
    }

    //현재따로 규칙이 없기 때문에 아래 모두 true
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() { //암호사용기간이 지났는지에 관해 검증
        return true;
    }

    @Override
    public boolean isEnabled() { //특정 사이트의 규약을 따를 것 인가? ex) 1년에 한번씩 비밀번호를 바꿔야한다.
        return true;
    }
}
