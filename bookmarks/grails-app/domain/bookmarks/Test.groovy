package bookmarks



class Test {
	static void main(def args) {
		def b = new Bookmark(url: new URL('http://grails.org'),
		title: 'Grails', 
		notes:'Groovy-based web framework')
	
		b.addToTags( new Tag(name: 'grails'))
		.addToTags( new Tag(name: 'web framework'))
		
		b.tags.each {println it.name}
	}
}
