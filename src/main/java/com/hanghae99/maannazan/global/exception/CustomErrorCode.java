package com.hanghae99.maannazan.global.exception;


import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

import static org.springframework.http.HttpStatus.*;

@Getter
@AllArgsConstructor
public enum CustomErrorCode {
    /* 400 BAD_REQUEST : 잘못된 요청 */
    INVALID_TOKEN(UNAUTHORIZED, "토큰이 유효하지 않습니다"),
    DUPLICATE_USER(BAD_REQUEST, "중복된 사용자가 존재합니다"),
    DUPLICATE_NICKNAME(BAD_REQUEST, "중복된 닉네임이 존재합니다"),
    NOT_PROPER_PASSWORD(BAD_REQUEST, "비밀번호가 일치하지 않습니다."),
    NOT_PROPER_INPUTFORM(BAD_REQUEST, "입력한 형식이 맞지 않습니다."),
    NOT_PROPER_URLFORM(BAD_REQUEST, "입력한 URL 형식이 맞지 않습니다."),
    NOT_AUTHOR(BAD_REQUEST, "작성자만 삭제/수정할 수 있습니다."),
    WRONG_ADMIN_TOKEN(BAD_REQUEST, "관리자 암호가 틀려 등록이 불가능합니다."),
    CAN_NOT_RESERVATE_ROOM(BAD_REQUEST, "예약하실 수 없는 날짜입니다."),
    OVER_GUEST_COUNT(BAD_REQUEST, "수용 가능 인원보다 많습니다."),

    /* 404 NOT_FOUND : Resource 를 찾을 수 없음 */
    USER_NOT_FOUND(NOT_FOUND, "등록된 사용자가 없습니다"),
    POST_NOT_FOUND(NOT_FOUND, "선택한 게시물을 찾을 수 없습니다."),
    COMMENT_NOT_FOUND(NOT_FOUND, "선택한 댓글을 찾을 수 없습니다."),
    ROOM_NOT_FOUND(NOT_FOUND, "선택한 숙소를 찾을 수 없습니다."),
    RESERVATION_NOT_FOUND(NOT_FOUND, "현재 이 숙소에 아무 예약이 안되어 있습니다.");


    private final HttpStatus httpStatus;
    private final String message;
}
