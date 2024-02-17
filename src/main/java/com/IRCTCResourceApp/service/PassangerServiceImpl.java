package com.IRCTCResourceApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.IRCTCResourceApp.model.Passanger;
import com.IRCTCResourceApp.model.Ticket;
import com.IRCTCResourceApp.repository.PassangerRepository;

@Service
public class PassangerServiceImpl implements PassangerServiceI {

	
	
	@Autowired
	private PassangerRepository passangerRepository;
	
	
	@Override
	public Ticket bookTicket(Passanger psg) {
		Passanger save = passangerRepository.save(psg);
		
		if(save != null) {
			Ticket t = new Ticket();
			t.setTid(0);
			t.settPnr("25698");
			t.setTprice(750.65);
			t.setTicketStatus("BookED");
			return t;
		}else {
			
			return null;
		}
		
		
		
		
	}

}
