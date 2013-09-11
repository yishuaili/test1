package bookmarks


class Bookmark {
	//static optionals = ['notes']
	static hasMany = [tags:Tag]
	String url
	String title
	String notes
	Date dateCreated
	
	static constraints = {
		url (url:true)
		title (blank:false)
	}
	
}
