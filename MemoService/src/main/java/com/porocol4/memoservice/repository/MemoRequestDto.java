package com.porocol4.memoservice.repository;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemoRequestDto {

    private String username;

    private String contents;
}
