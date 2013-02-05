package uk.ac.ox.oucs.vle;
// Generated Aug 17, 2010 10:15:40 AM by Hibernate Tools 3.2.2.GA


import java.util.HashSet;
import java.util.Set;

/**
 * CourseGroupDAO generated by hbm2java
 */
public class CourseGroupDAO implements java.io.Serializable, Cloneable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int muid;
	private String courseId;
	private String title;
	private String dept;
	private Set<CourseComponentDAO> components = new HashSet<CourseComponentDAO>(0);
	private Set<CourseSignupDAO> signups = new HashSet<CourseSignupDAO>(0);
	private Set<String> administrators = new HashSet<String>(0);
	private Set<String> superusers = new HashSet<String>(0);
	private Set<String> otherDepartments = new HashSet<String>(0);
	private Set<CourseCategoryDAO> categories = new HashSet<CourseCategoryDAO>(0);
	private String description;
	private String departmentName;
	private String subunit;
	private String subunitName;
	private String contactEmail;
	private String visibility;
	private String regulations;
	private String source;
	private boolean supervisorApproval;
	private boolean administratorApproval;
	private boolean hideGroup;
	private boolean deleted;

	public CourseGroupDAO() {
	}

	public CourseGroupDAO(String courseId) {
		this.courseId = courseId;
	}

	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + muid;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (obj == null || obj.getClass() != this.getClass()) {
			return false;
		}

		CourseGroupDAO dao = (CourseGroupDAO)obj;
		return getMuid() == dao.getMuid();
	}

	public int getMuid() {
		return this.muid;
	}

	public void setMuid(int muid) {
		this.muid = muid;
	}

	public String getCourseId() {
		return this.courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDept() {
		return this.dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getSubunit() {
		return this.subunit;
	}

	public void setSubunit(String subunit) {
		this.subunit = subunit;
	}

	public Set<CourseComponentDAO> getComponents() {
		return this.components;
	}

	public void setComponents(Set<CourseComponentDAO> components) {
		this.components = components;
	}

	public Set<CourseSignupDAO> getSignups() {
		return this.signups;
	}

	public void setSignups(Set<CourseSignupDAO> signups) {
		this.signups = signups;
	}

	public Set<String> getAdministrators() {
		return this.administrators;
	}

	public void setAdministrators(Set<String> administrators) {
		this.administrators = administrators;
	}

	public Set<String> getSuperusers() {
		return this.superusers;
	}

	public void setSuperusers(Set<String> superusers) {
		this.superusers = superusers;
	}

	public Set<String> getOtherDepartments() {
		return this.otherDepartments;
	}

	public void setOtherDepartments(Set<String> otherDepartments) {
		this.otherDepartments = otherDepartments;
	}

	public Set<CourseCategoryDAO> getCategories() {
		return categories;
	}

	public void setCategories(Set<CourseCategoryDAO> categories) {
		this.categories = categories;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}


	public String getSubunitName() {
		return subunitName;
	}

	public void setSubunitName(String subunitName) {
		this.subunitName = subunitName;
	}

	public boolean getSupervisorApproval() {
		return supervisorApproval;
	}

	public void setSupervisorApproval(boolean supervisorApproval) {
		this.supervisorApproval = supervisorApproval;
	}

	public boolean getAdministratorApproval() {
		return administratorApproval;
	}

	public void setAdministratorApproval(boolean administratorApproval) {
		this.administratorApproval = administratorApproval;
	}

	public boolean getHideGroup() {
		return hideGroup;
	}

	public void setHideGroup(boolean hideGroup) {
		this.hideGroup = hideGroup;
	}

	public boolean getDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	public String getContactEmail() {
		return contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public String getVisibility() {
		return visibility;
	}

	public void setVisibility(String visibility) {
		this.visibility = visibility;
	}

	public String getRegulations() {
		return regulations;
	}

	public void setRegulations(String regulations) {
		this.regulations = regulations;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

}


