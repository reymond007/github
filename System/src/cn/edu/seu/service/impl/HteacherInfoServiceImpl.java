package cn.edu.seu.service.impl;

import java.util.List;

import cn.edu.seu.dao.HteacherInfoDao;
import cn.edu.seu.pojo.Hteacher;
import cn.edu.seu.service.HteacherInfoService;

public class HteacherInfoServiceImpl implements HteacherInfoService{
	
	private HteacherInfoDao hteacherInfoDao;

	public HteacherInfoDao getHteacherInfoDao() {
		return hteacherInfoDao;
	}

	public void setHteacherInfoDao(HteacherInfoDao hteacherInfoDao) {
		this.hteacherInfoDao = hteacherInfoDao;
	}
    /**
     * ��ӵ�������Ա��Ϣ
     * @param hteacher ��Ҫ��ӵĽ���Ա
     */
	@Override
	public void addOne(Hteacher hteacher) {
	
		hteacherInfoDao.addOne(hteacher);	
	}
	/**
     * ɾ����������Ա��Ϣ
     * @param hteacher ��Ҫɾ���Ľ���Ա
     */
	@Override
	public void deleteOne(Hteacher hteacher) {
		Hteacher h = new Hteacher();
		//�û�����Ĳ�ѯ����
		h.setHteacherNumber(hteacher.getHteacherNumber());
		//�ҳ������ʦ��Ϣ
		List <Hteacher> htelist = hteacherInfoDao.findByNumber(h);
		//ɾ������
		for (Hteacher hl : htelist)
		{
			System.out.println(hl.getHteacherNumber());
			Hteacher ht = hteacherInfoDao.load(hl.getHteacherId());
			hteacherInfoDao.deleteOne(ht);
		}
		
	}
	/**
     * �޸ĵ�������Ա��Ϣ
     * @param hteacher ��Ҫ�޸ĵĽ���Ա
     */
	@Override
	public void updateOne(Hteacher hteacher) {
		Hteacher h = new Hteacher();
		//System.out.println(h);
		//System.out.println(hteacher.getHteacherNumber());
		h.setHteacherNumber(hteacher.getHteacherNumber());
		//h.setHteacherNumber(hteacher.getHteacherNumber());
		List <Hteacher> htclist = hteacherInfoDao.findByNumber(h);
		Hteacher ht = hteacherInfoDao.load(htclist.get(0).getHteacherId());
		//ht.setPassword(hteacher.getPassword());
		//ht.setHteacherNumber(hteacher.getHteacherNumber());
		ht.setHteacherName(hteacher.getHteacherName());
		ht.setSex(hteacher.getSex());
		ht.setAge(hteacher.getAge());
		//ht.setDepartment(hteacher.getDepartment());
		//ht.setAddress(hteacher.getAddress());
		//ht.setStatus(hteacher.getStatus());
		//ht.setMailAddress(hteacher.getMailAddress());
		//ht.setProfessionLevel(hteacher.getProfessionLevel());
		hteacherInfoDao.updateOne(ht);
	}

	@Override
	public List<Hteacher> findByNumber(Hteacher hteacher) {
		return hteacherInfoDao.findByNumber(hteacher);
	}
	
}
