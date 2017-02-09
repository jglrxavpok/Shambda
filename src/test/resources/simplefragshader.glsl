#version 330

in vec4 vertColor;
out vec4 finalColor;

void main() {

	finalColor = vertColor * vec4(1,0,0,1);
}