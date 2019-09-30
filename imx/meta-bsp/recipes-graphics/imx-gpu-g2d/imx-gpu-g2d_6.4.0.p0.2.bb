require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p1.8.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "963b0b2afc579ed84885fd766f374b18"
SRC_URI[aarch64.sha256sum] = "c733972b43fdfca6c4ca9c06b841da6b162b9d58564a3fb1a672bb0c7261d05b"
SRC_URI[arm.md5sum] = "c9a8da94f953b3205bbc12bcf06aaeb2"
SRC_URI[arm.sha256sum] = "9ce6c11a9d03cb86ed8048aeca79602a12f27a6c588ca2abe013fe6f9131c0a1"
