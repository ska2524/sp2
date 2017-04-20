package org.zerock.service;

import java.util.List;

import org.zerock.domain.Criteria;
import org.zerock.domain.StoreVO;

public interface StoreService { //비지니스 용어를 쓰는곳
	
	
	public void register(StoreVO vo)throws Exception;//잘못되면 확실한 리턴이 필요하다.
	
	public StoreVO findBySno(Integer sno) throws Exception;
	
	public void modify(StoreVO vo)throws Exception;
	
	public void remove(Integer sno) throws Exception;
	
	public List<StoreVO> getList(Criteria cri) throws Exception;
}
