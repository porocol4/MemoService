package com.porocol4.memoservice.repository;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@RequiredArgsConstructor
@Getter
@Entity
public class Memo extends Timestamped {

    /*
    메모생성    POST    /api/memos          Memo
    메모조회    Get     /api/memos          List<Memo>
    메모변경    PUT     /api/memos/{id}     Long
    메모삭제    DELETE  /api/momos/{id}     Long
     */

    /* id, username, memo */

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String contents;

    public Memo(String username, String contents){
        this.username = username;
        this.contents = contents;
    }

    public Memo(MemoRequestDto requestDto){
        this.username = requestDto.getUsername();
        this.contents = requestDto.getContents();
    }

    public void update(MemoRequestDto requestDto){
        this.username = requestDto.getUsername();
        this.contents = requestDto.getContents();
    }



}
