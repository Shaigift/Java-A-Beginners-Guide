// Module definition for the functions module.
module appfuncs {
    // Exports the package appfuncs.simplefuncs. to appstart.
    exports appfuncs.simplefuncs to appstart;

    // Requires appsupport and makes it public
    requires transitive appsupport;
}