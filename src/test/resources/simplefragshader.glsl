#version 330

in vec4 vertColor;
out vec4 finalColor;

void main() {
	finalColor = vertColor * vec4(1,vertColor.r,0,1);
}