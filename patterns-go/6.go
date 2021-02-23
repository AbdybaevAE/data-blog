package main

import "fmt"

type folder struct {
	childrens []inode
	name      string
}

func (f *folder) print(identation string) {
	fmt.Printf("%s printing hierachy for folder %s \n", identation, f.name)
	for _, v := range f.childrens {
		v.print(identation + identation)
	}
}

func (f *folder) clone() inode {
	dir := &folder{name: f.name}
	for _, v := range f.childrens {
		dir.childrens = append(dir.childrens, v.clone())
	}
	return dir
}
