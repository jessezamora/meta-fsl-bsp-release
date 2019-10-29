require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p1.8.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "cac508753739e7c645e5974c07523070"
SRC_URI[aarch64.sha256sum] = "8460be10a5b2a76bbeb868c8088a57aa2967ffa599316b4010064a8a21fe3cd9"
SRC_URI[arm.md5sum] = "c7c5a9f6cd45b1a716d0f41479919c9e"
SRC_URI[arm.sha256sum] = "6d6d02d035d988cbdb2014794f2efe970a3f5ac277202882bbf553bb7fd789d2"
