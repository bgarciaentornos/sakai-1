package uk.ac.ox.oucs.vle;

import java.util.Collections;
import java.util.Date;


public class CourseComponentImpl implements CourseComponent {
	
	private CourseComponentDAO dao;
	//private CourseSignupServiceImpl impl;
	
	/// Local caches.
	private transient Date opens;
	private transient Date closes;
	private transient Date starts;
	private transient Date ends;
	
	public CourseComponentImpl(CourseComponentDAO dao, CourseSignupServiceImpl impl) {
		this.dao = dao;
		//this.impl = impl;
	}

	public String getId() {
		return dao.getId();
	}
	
	public String getSubject() {
		return dao.getSubject();
	}

	public String getTitle() {
		return dao.getTitle();
	}

	public int getPlaces() {
		return dao.getSize() - dao.getTaken();
	}

	public int getSize() {
		return dao.getSize();
	}

	public Person getPresenter() {
		if (dao.getTeacherName() != null) {
			return new PersonImpl(null, null, null, 
					dao.getTeacherName(), dao.getTeacherEmail(), 
					Collections.<String>emptyList(), 
					null, null, null, null);
		}
		return null;
	}
	
	public String getLocation() {
		return dao.getLocation();
	}

	public Date getOpens() {
		// Jackson doesn't like java.sql.Date.
		if (opens == null)
			opens = new Date(dao.getOpens().getTime());
		return opens;
	}

	public Date getCloses() {
		// Jackson doesn't like java.sql.Date.
		if(closes == null)
			closes = new Date(dao.getCloses().getTime());
		return dao.getCloses();
	}
	
	public Date getStarts() {
		// Jackson doesn't like java.sql.Date.
		if(starts == null && dao.getStarts() != null) {
			starts = new Date(dao.getStarts().getTime());
		}
		return starts;
	}

	public Date getEnds() {
		// Jackson doesn't like java.sql.Date.
		if(ends == null && dao.getEnds() != null) {
			ends = new Date(dao.getEnds().getTime());
		}
		return ends;
	}

	public String getComponentSet() {
		return dao.getComponentId(); 
	}

	public String getWhen() {
		return dao.getWhen();
	}

	public String getSlot() {
		return dao.getSlot();
	}

	public String getSessions() {
		return dao.getSessions();
	}
	
	public boolean getBookable() {
		return dao.isBookable();
	}

}
