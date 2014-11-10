package org.rad

class Description {
	Integer numberOfPages
	Integer size
	String comment
	Title title
	Summary summary
	
	static contraints ={
		numberOfPages nullable: true
		size nullable: true
		comment nullable: true, maxSize:1000
		title blank: false, nullable: false
	}
	static hasMany = [keyWord: KeyWord]
	
	String toString(){return title}
}
