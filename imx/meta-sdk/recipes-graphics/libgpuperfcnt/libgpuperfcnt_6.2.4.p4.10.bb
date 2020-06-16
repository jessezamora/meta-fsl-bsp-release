DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=1b4db4b25c3a1e422c0c0ed64feb65d2"

SRC_URI[arm-fb.md5sum] = "c8baaecbff57a67c45536d0ae568ac70"
SRC_URI[arm-fb.sha256sum] = "4a9f5a8e91674e046346bfe4f769c5136d150a60c6efa779f03208fb763fe6c7"

SRC_URI[arm-wayland.md5sum] = "28213cbeaadb7f9ceb7dba5f3096a991"
SRC_URI[arm-wayland.sha256sum] = "c66e5899c941dc345f80bf523df29893adb51e1002079158e6bd7374e4de4ae7"

SRC_URI[arm-x11.md5sum] = "71c09dc66ebc108e387580718988909b"
SRC_URI[arm-x11.sha256sum] = "cc29626108064123b8712fa230636ae0b67d849d7591da924879c056e20d4f8f"

SRC_URI[aarch64-fb.md5sum] = "bbcb142b96df2d765bfcfef00baac2b8"
SRC_URI[aarch64-fb.sha256sum] = "de81da63b56d40fafaabcaeb82223e73a4ae9ab4d487ac4d11da9b5ad4b82c1c"

SRC_URI[aarch64-wayland.md5sum] = "8e09713aafd048817db815e2adcbd897"
SRC_URI[aarch64-wayland.sha256sum] = "a5ef3f7712cf5aff3c59de697c5323d2483538af9cd35f68b0f7c5c756958a59"

SRC_URI[aarch64-x11.md5sum] = "19081d1a1f3604af4c608df3125074f1"
SRC_URI[aarch64-x11.sha256sum] = "ed6547697609c5d21c60bd12a6770661eba0012546cecfc4890a411864d8e352"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

COMPATIBLE_MACHINE = "(imxgpu)"
