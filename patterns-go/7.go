package main

func main() {
	folder1 := initFS()
	folder2 := someBusinessLogic(folder1)
	folder1.print(" ")
	folder2.print(" ")

}
func someBusinessLogic(in inode) inode {
	return in.clone()

}
func initFS() inode {
	file1 := &file{name: "File1"}
	file2 := &file{name: "File2"}
	file3 := &file{name: "File3"}
	folder1 := &folder{
		childrens: []inode{file1},
		name:      "Folder1",
	}
	folder2 := &folder{
		childrens: []inode{folder1, file2, file3},
		name:      "Folder2",
	}
	return folder2
}
