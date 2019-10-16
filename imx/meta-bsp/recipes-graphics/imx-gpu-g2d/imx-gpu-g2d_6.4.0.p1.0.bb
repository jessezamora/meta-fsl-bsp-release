require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p1.8.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "7f0f76221c0f87fd6ad6b3803435de0b"
SRC_URI[aarch64.sha256sum] = "d752cf0666a7d7e06f297e5b96a768de64cb39daa7443b96aa7b2ef2e4107ead"
SRC_URI[arm.md5sum] = "15e7d3249164e5ead2ae8f89535b64c1"
SRC_URI[arm.sha256sum] = "66a1e55cc1c3a50f8fa24d32408ccc85e4e57ec5a87815a4be02ad5984849abb"
