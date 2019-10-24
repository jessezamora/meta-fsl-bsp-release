require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p1.8.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "cf40e6a37e9897ce8d8c09b4411a42e3"
SRC_URI[aarch64.sha256sum] = "f823faf4614f8b525d96f5b9572d0469c1f51349eb328337fab01134b61d8eb0"
SRC_URI[arm.md5sum] = "6ef42eb7dc7bbfe619168f42c97905b7"
SRC_URI[arm.sha256sum] = "6506bd22fda1618af182ad3e13b9c7fec4d16892c68206f441dd63ca65424aa7"
