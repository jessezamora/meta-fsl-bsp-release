require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p1.8.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "bf829212376699a88b76f6d3dbee30e0"
SRC_URI[aarch64.sha256sum] = "eb8963451f2a1c1da7805d5504c2cac78520e3885b45fd1121fa810da68e7f6e"
SRC_URI[arm.md5sum] = "a87d9515f89c955bb2dfa5721c879811"
SRC_URI[arm.sha256sum] = "c3305f11d58de90428d99d2b989c26dfdcb7ab31182f8833b804bd7f33ce22b9"
