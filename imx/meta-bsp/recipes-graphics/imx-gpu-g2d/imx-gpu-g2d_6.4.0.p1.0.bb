require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p1.8.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "7f0f76221c0f87fd6ad6b3803435de0b"
SRC_URI[aarch64.sha256sum] = "d752cf0666a7d7e06f297e5b96a768de64cb39daa7443b96aa7b2ef2e4107ead"
SRC_URI[arm.md5sum] = "5778172c96af8fad7ab469f8f821cec1"
SRC_URI[arm.sha256sum] = "9632b2c35fb6dd45aebdc29ebb14f59372ff81c0b6ff22cb7b69e9133a3daf51"
