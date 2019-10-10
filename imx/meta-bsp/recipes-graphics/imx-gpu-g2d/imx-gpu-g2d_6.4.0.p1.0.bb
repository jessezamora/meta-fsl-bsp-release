require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p1.8.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "e4de2810e4e456ae61be3f114fcbd788"
SRC_URI[aarch64.sha256sum] = "edcddf77717527987dd1b3d6f74b7f14fe2aaafaccaf1cbee3d2f343be054fe2"
SRC_URI[arm.md5sum] = "c9a8da94f953b3205bbc12bcf06aaeb2"
SRC_URI[arm.sha256sum] = "9ce6c11a9d03cb86ed8048aeca79602a12f27a6c588ca2abe013fe6f9131c0a1"
