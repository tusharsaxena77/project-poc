class BootStrap {
    def bootStrapService
    def init = { servletContext ->
        bootStrapService.bootstrapEssentialData()
    }
    def destroy = {
    }
}
