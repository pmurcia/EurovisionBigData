package com.pmurmor.eurovision.domain;

import java.util.*;

public class Participant {
	
	private int id;
	private Country country;
	private Event event;
	
	private Map<Country,Integer> pointsGiven;
	private Map<Country,Integer> pointsReceived;
	
	public Participant(int id, Country country, Event event, Map<Country, Integer> pointsGiven,
			Map<Country, Integer> pointsReceived) {
		this.setId(id);
		this.setCountry(country);
		this.setEvent(event);
		this.setPointsGiven(pointsGiven);
		this.setPointsReceived(pointsReceived);
	}
	
	public int getId() {
		return id;
	}

	public Country getCountryId() {
		return country;
	}

	public Event getEventId() {
		return event;
	}

	public Map<Country, Integer> getPointsGiven() {
		return pointsGiven;
	}

	public Map<Country, Integer> getPointsReceived() {
		return pointsReceived;
	}

	private void setId(int id) {
		this.id = id;
	}
	
	private void setCountry(Country country) {
		this.country = country;
	}
	
	private void setEvent(Event event) {
		this.event = event;
	}
	
	private void setPointsGiven(Map<Country, Integer> pointsGiven) {
		this.pointsGiven = pointsGiven;
	}
	
	private void setPointsReceived(Map<Country, Integer> pointsReceived) {
		this.pointsReceived = pointsReceived;
	}
}
