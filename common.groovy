

def delete(){
	println "Deletingggggggggggggggggg File"
}

def initProperties(filename){
    props = readProperties file: filename
    println 'Properties passed in are ' + props
}