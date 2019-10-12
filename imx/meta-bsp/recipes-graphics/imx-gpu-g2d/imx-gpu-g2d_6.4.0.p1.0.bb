require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p1.8.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "7b284ce787f709a04d04972bd91dee12"
SRC_URI[aarch64.sha256sum] = "3f96f381fe95cf87a3edfdcf40d09a5997983be2742c3deaf0d6648bffc46dd8"
SRC_URI[arm.md5sum] = "0910260f23ef70c9e31410a1730bfc52"
SRC_URI[arm.sha256sum] = "e8be7aabdd617a733079e4d4594af8720020d177390574ac39392d5cb69feb5b"
