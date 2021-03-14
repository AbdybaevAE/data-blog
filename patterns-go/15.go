package abstract_factory

type shoe struct {
	logo string
	size int
}
type iShoe interface {
	Size() int
	SetSize(size int)
	Logo() string
	SetLogo(logo string)
}

func (s *shoe) SetLogo(logo string) {
	s.logo = logo
}
func (s *shoe) Logo() string {
	return s.logo
}
func (s *shoe) SetSize(size int) {
	s.size = size
}
func (s *shoe) Size() int {
	return s.size
}
