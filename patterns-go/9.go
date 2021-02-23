package main

import "fmt"

func main() {
	sender := Sender{}
	jsonMsg, err := sender.BuildMessage(&JsonBuilder{})
	if err != nil {
		panic(err)
	}
	fmt.Println(string(jsonMsg.Body))
	xmlMsg, err := sender.BuildMessage(&XmlBuilder{})
	if err != nil {
		panic(err)
	}
	fmt.Println(string(xmlMsg.Body))
}
