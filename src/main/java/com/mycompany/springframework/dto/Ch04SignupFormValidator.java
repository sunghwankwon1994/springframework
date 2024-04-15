package com.mycompany.springframework.dto;

import java.util.regex.Pattern;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Ch04SignupFormValidator implements Validator {
  @Override
  public boolean supports(Class<?> clazz) {
    log.info("회원가입 supports 실행");
    return Ch04SignupForm.class.isAssignableFrom(clazz);
  }

  @Override
  public void validate(Object target, Errors errors) {
    Ch04SignupForm signupForm = (Ch04SignupForm) target;
    
    // 아이디 검사
    String mid = signupForm.getMid();
    if(mid == null || mid.equals("")) {
      errors.rejectValue("mid", null,"아이디는 필수 입력");
    } else if(mid.length()<6 || mid.length()>12) {
      errors.rejectValue("mid", null,"아이디는 6자 이상 12자리 이하로 입력해야 합니다.");      
    }
    
    //이메일 검사
    String memail = signupForm.getMemail();
    String emailPattern = "^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$";
    if(memail == null || memail.equals("")) {
      errors.rejectValue("memail", null,"이메일은 필수 입력");
    } else if(!Pattern.matches(emailPattern, memail)) {
      errors.rejectValue("memail", null,"올바른 이메일 형식을 입력해주세요");      
    }
    
    //이름 검사
    String mname = signupForm.getMname();
    if(mname == null || mname.equals("")) {
      errors.rejectValue("mname", null,"이름은 필수 입력");
    } else if(mname.length()<2 || mname.length()>16) {
      errors.rejectValue("mname", null,"이름은 최소 2자이상 16자리 이하로 입력해야합니다.");      
    }
    
    //휴대폰 번호 검사
    String mphoneNum = signupForm.getMphoneNum();
    String phonePattern ="^\\d{3}-\\d{3,4}-\\d{4}$";
    if(mphoneNum == null || mphoneNum.equals("")) {
      errors.rejectValue("mphoneNum", null,"휴대폰 번호는 필수 입력");
    } else if(!Pattern.matches(phonePattern, mphoneNum)) {
      errors.rejectValue("mphoneNum", null,"올바른 휴대폰 번호 형식을 입력해주세요");      
    }
    
    // 비밀번호 검사
    String mpassword = signupForm.getMpassword1();
    String pattern = "(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,15}";
    if(mpassword == null || mpassword.equals("")) {
      errors.rejectValue("mpassword1", null,"비밀번호는 필수 입력");
    } else if(mpassword.length()<8 || mpassword.length()>15) {
      errors.rejectValue("mpassword1", null,"비밀번호는 6자 이상 12자리 이하로 입력해야 합니다.");      
    } else if(!Pattern.matches(pattern, mpassword)) {
      errors.rejectValue("mpassword1", null,"비밀번호는 알파벳 대소문자 및 숫자를 포함해야함");      
    }
    String mpasswordComfirm = signupForm.getMpassword2();
  
    if(mpasswordComfirm == null || mpasswordComfirm.equals("") ) {
      errors.rejectValue("mpassword2", null,"비밀번호 확인 칸은 필수 입력입니다.");
    } else if(!mpasswordComfirm.equals(mpassword)) {
      errors.rejectValue("mpassword2", null,"비밀번호가 일치하지 않습니다.");      
    }
  }
}
