package abstract_factory

type iShirt interface {
	Size() int
	SetSize(size int)
	Logo() string
	SetLogo(logo string)
}

type shirt struct {
	logo string
	size int
}

func (s *shirt) SetLogo(logo string) {
	s.logo = logo
}
func (s *shirt) Logo() string {
	return s.logo
}
func (s *shirt) SetSize(size int) {
	s.size = size
}
func (s *shirt) Size() int {
	return s.size
}
