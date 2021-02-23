package main

import (
	"encoding/json"
	"encoding/xml"
)

type MessageFormat int

const (
	JSON_FORMAT MessageFormat = iota
	XML_FORMAT
)

type Message struct {
	Body   []byte
	Format MessageFormat
}
type MessageBuilder interface {
	SetRecepient(recepient string)
	SetText(text string)
	Build() (*Message, error)
}
type JsonBuilder struct {
	recepient string
	text      string
}

func (jb *JsonBuilder) SetRecepient(recepient string) {
	jb.recepient = recepient
}
func (jb *JsonBuilder) SetText(text string) {
	jb.text = text
}
func (jb *JsonBuilder) Build() (*Message, error) {
	m := make(map[string]string)
	m["recepient"] = jb.recepient
	m["text"] = jb.text
	data, err := json.Marshal(m)
	if err != nil {
		return nil, err
	}
	return &Message{Body: data, Format: JSON_FORMAT}, nil
}

type XmlBuilder struct {
	recepient string
	text      string
}
type XMLMessage struct {
	Recipient string `xml:"recipient"`
	Text      string `xml:"body"`
}

func (xb *XmlBuilder) SetRecepient(recepient string) {
	xb.recepient = recepient
}
func (xb *XmlBuilder) SetText(text string) {
	xb.text = text
}
func (xb *XmlBuilder) Build() (*Message, error) {
	m := XMLMessage{Recipient: xb.recepient, Text: xb.text}
	data, err := xml.Marshal(m)
	if err != nil {
		return nil, err
	}
	return &Message{Body: data, Format: XML_FORMAT}, nil
}

type Sender struct {
}

func (s *Sender) BuildMessage(mb MessageBuilder) (*Message, error) {
	mb.SetRecepient("Santa Claus")
	mb.SetText("I was a good body, give me a gift!")
	return mb.Build()
}
