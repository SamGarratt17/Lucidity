#version 120

uniform sampler2D Sampler0;

void main() {
    vec2 uv = gl_TexCoord[0].st;
    vec4 color;

    // Create chromatic aberration effect
    color.r = texture2D(Sampler0, uv + vec2(0.01, 0)).r;
    color.g = texture2D(Sampler0, uv).g;
    color.b = texture2D(Sampler0, uv - vec2(0.01, 0)).b;

    gl_FragColor = color;
}