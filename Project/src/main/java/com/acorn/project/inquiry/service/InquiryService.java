package com.acorn.project.inquiry.service;

import javax.servlet.http.HttpServletRequest;

import com.acorn.project.inquiry.dto.InquiryCommentDto;
import com.acorn.project.inquiry.dto.InquiryDto;



public interface InquiryService {
	public void getList(HttpServletRequest request);
	public void getDetail(HttpServletRequest request);
	public void saveContent(InquiryDto dto);
	public void updateContent(InquiryDto dto);
	public void deleteContent(int num, HttpServletRequest request);
	public void saveComment(HttpServletRequest request);//댓글 저장 
	public void deleteComment(HttpServletRequest request);//댓글 삭제
	public void updateComment(InquiryCommentDto dto);//댓글 수정
	public void moreCommentList(HttpServletRequest request);//댓글 추가 응답
}