DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3" 

SRC_URI[arm-fb.md5sum] = "be8f0d95565ca7f95c23a4985eeba344"
SRC_URI[arm-fb.sha256sum] = "264d2e5a8666ba72abdb34f85befd84327dbb0eae8158f033567247db0792eb0"

SRC_URI[arm-wayland.md5sum] = "a21804a10b7322c17593a6a51f1f2f4c"
SRC_URI[arm-wayland.sha256sum] = "e317c80fc163815d1e8797cf41360c36620b15736e7c606279577b615895e775"

SRC_URI[arm-x11.md5sum] = "e1b4d8a91f3e5cc35c6173981eaee2a7"
SRC_URI[arm-x11.sha256sum] = "83758b6da3a027fc1d372f7f7d19c926900e8e4b757026708abf8883e15d98a2"

SRC_URI[aarch64-fb.md5sum] = "66604794e40521a08c0f515f62b8b97a"
SRC_URI[aarch64-fb.sha256sum] = "ae147c283c19c3076e7182426d4de5b295bf911115f5c360df94ec322a8bca80"

SRC_URI[aarch64-wayland.md5sum] = "329ff66cf4efb5e698969a8927f39acb"
SRC_URI[aarch64-wayland.sha256sum] = "d31939625538e7221d046fa67bfed813535814c21c4446a075d07e8bc6ac262c"

SRC_URI[aarch64-x11.md5sum] = "f04966211c7c2d4f647d420510281b85"
SRC_URI[aarch64-x11.sha256sum] = "e1f0627e1413efc6dbd30479e35a9a4d405587054e7f769e4d429a9cc5caa7c3"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
