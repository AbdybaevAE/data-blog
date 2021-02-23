package cards

import (
	"sync"
)

type holder map[string]string

var storeObject holder
var once sync.Once

func New() holder {
	once.Do(func() {
		storeObject = make(holder)
	})
	return storeObject
}
