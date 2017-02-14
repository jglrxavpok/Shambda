#version 450

in vec4 vertColor;
out vec4 finalColor;
const float[2] array = {1,2};

void main() {
    float[2] otherArray = array;
    vec4 something = vec4(vertColor.rgb, otherArray[1]);
	finalColor = vertColor * vec4(otherArray[0],something.r,0,1);
}