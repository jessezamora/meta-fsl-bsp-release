
SRCBRANCH = "imx_v2013.04_3.10.17_1.0.0_ga"
SRC_URI = "git://${FSL_ARM_GIT_SERVER}/uboot-imx.git;protocol=git;branch=${SRCBRANCH}"
SRCREV = "06dd4f798b2014ed9642f8d6f526aa9630dd8ca5"

# save UBOOT_CONFIG as separate names
do_deploy_append() {
    install ${S}/${UBOOT_BINARY} ${DEPLOYDIR}/${UBOOT_IMAGE}_${UBOOT_CONFIG}
}
