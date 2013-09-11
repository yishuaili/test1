package bookmarks

class Tag {
	static belongsTo = Bookmark
	Bookmark bookmark
	String name
}
