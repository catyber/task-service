package com.development.taskservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.development.taskservice.model.Member;

interface MemberRepository extends JpaRepository<Member, Long>{

}
