package com.king.Booking.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.king.Booking.dao.impl.TucaoDaoImpl;
import com.king.Booking.entity.Tucao;



public class TucaoServiceImpl {
	public  List<Tucao> getTucao(){
		 List<Tucao> tc= new ArrayList<Tucao>();
		 TucaoDaoImpl tdi = new TucaoDaoImpl();
		 tc = tdi.getTucao();
		 return tc;
	}
		
	public void setTucao(String data) {
		TucaoDaoImpl tdi = new TucaoDaoImpl();
		tdi.setTucao(data);
	}
}
