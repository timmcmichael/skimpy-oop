#!/bin/bash

# Define output directory
OUTPUT_DIR="output-test"
ASCIIDOCTOR_PATH="$HOME/.gem/ruby/2.6.0/bin/asciidoctor-multipage"
DIAGRAM_PATH="$HOME/.gem/ruby/2.6.0/gems/asciidoctor-diagram-2.3.1/lib/asciidoctor-diagram"
FALLBACK_PATH="/usr/local/bin/asciidoctor-multipage"
FALLBACK_DIAGRAM_PATH="/Library/Ruby/Gems/2.6.0/gems/asciidoctor-diagram-2.3.1/lib/asciidoctor-diagram"

# Use fallback if the primary path is missing or not executable
if [ ! -x "$ASCIIDOCTOR_PATH" ]; then
    ASCIIDOCTOR_PATH="$FALLBACK_PATH"
fi

if [ ! -x "$DIAGRAM_PATH" ]; then
    DIAGRAM_PATH="$FALLBACK_DIAGRAM_PATH"
fi 

# Remove old output
rm -rf "$OUTPUT_DIR"

# Run the command with the selected Asciidoctor path
"$ASCIIDOCTOR_PATH" \
    -r "$DIAGRAM_PATH" \
    -b multipage_html5 \
    -a source-highlighter=pygments \
    index.adoc