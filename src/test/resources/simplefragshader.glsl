#version 330

in vec4 vertColor;
out vec4 finalColor;

void main() {
    vec4 something = vec4(vertColor.rgb, 0);
	finalColor = vertColor * vec4(1,something.r,0,1);
}