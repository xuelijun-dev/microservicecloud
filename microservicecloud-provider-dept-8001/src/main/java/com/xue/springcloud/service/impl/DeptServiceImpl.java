package com.xue.springcloud.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.xue.springcloud.entities.Dept;
import com.xue.springcloud.service.DeptService;
import org.springframework.stereotype.Service;

@Service
public class DeptServiceImpl implements DeptService
{
//	@Autowired
//	private DeptDao dao;
	
	@Override
	public boolean add(Dept dept)
	{
//		return dao.addDept(dept);
		return true;
	}

	@Override
	public Dept get(Long id)
	{
//		return dao.findById(id);
		return new Dept(1L,"开发部","cloud1");
	}

	@Override
	public List<Dept> list()
	{
//		return dao.findAll();
		List<Dept> list = new ArrayList<>();
		list.add(new Dept(1L,"开发部","cloud1"));
		list.add(new Dept(2L,"测试部","cloud1"));
		list.add(new Dept(3L,"产品部","cloud1"));
		return list;
	}

}
