require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p1.8.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "4f8a9bc8ee53dfbb269ba319bcebeede"
SRC_URI[aarch64.sha256sum] = "a09c3a5ffff2b727d7b2cb98b5479e9e2d16db2726b20872cb134f04b90f2f38"
SRC_URI[arm.md5sum] = "0910260f23ef70c9e31410a1730bfc52"
SRC_URI[arm.sha256sum] = "e8be7aabdd617a733079e4d4594af8720020d177390574ac39392d5cb69feb5b"
